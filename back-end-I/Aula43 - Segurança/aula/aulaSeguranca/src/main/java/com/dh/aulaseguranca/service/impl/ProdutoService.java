package com.dh.aulaseguranca.service.impl;

import com.dh.aulaseguranca.exception.InvalidDataException;
import com.dh.aulaseguranca.exception.ResourceNotFoundException;
import com.dh.aulaseguranca.model.Produto;
import com.dh.aulaseguranca.model.dto.ProdutoDTO;
import com.dh.aulaseguranca.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository produtoRepository;

    public ProdutoDTO salvar(ProdutoDTO produtoDTO) throws InvalidDataException {
        if (validaProduto(produtoDTO)){
            Produto produtoSalvo = produtoRepository.save(toProduto(produtoDTO));
            return toProdutoDTO(produtoSalvo);
        } else {
            throw new InvalidDataException("Não foi possível cadastrar o produto");
        }

    }

    public List<ProdutoDTO> buscarTodos() throws ResourceNotFoundException {
        List<Produto> listaProdutoEntity = produtoRepository.findAll();
        List<ProdutoDTO> listaProdutoDTO = new ArrayList<>();
        if (!listaProdutoEntity.isEmpty()) {
            for (Produto produto : listaProdutoEntity) {
                listaProdutoDTO.add(toProdutoDTO(produto));
            }
            return listaProdutoDTO;
        } else {
            throw new ResourceNotFoundException("Não há produtos cadastrados");
        }
    }

    public ProdutoDTO buscarPorId(Long id) throws ResourceNotFoundException {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (Objects.nonNull(produto)) {
            return toProdutoDTO(produto);
        } else {
            throw new ResourceNotFoundException("Produto não encontrado");
        }
    }

    public void excluir(Long id) throws ResourceNotFoundException {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (Objects.nonNull(produto)) {
            produtoRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Produto não encontrado");
        }
    }

    private Produto toProduto(ProdutoDTO produtoDTO) {
        return Produto.builder()
                .nome(produtoDTO.getNome())
                .descricao(produtoDTO.getDescricao())
                .categoria(produtoDTO.getCategoria())
                .quantidade(produtoDTO.getQuantidade())
                .build();
    }

    private ProdutoDTO toProdutoDTO(Produto produto) {
        return ProdutoDTO.builder()
                .nome(produto.getNome())
                .descricao(produto.getDescricao())
                .categoria(produto.getCategoria())
                .quantidade(produto.getQuantidade())
                .build();
    }

    private boolean validaProduto(ProdutoDTO produtoDTO) {
        return produtoDTO.getNome() != null &&
                !produtoDTO.getNome().isEmpty() &&
                !produtoDTO.getNome().isBlank() &&
                produtoDTO.getCategoria() != null &&
                !produtoDTO.getCategoria().isEmpty() &&
                !produtoDTO.getCategoria().isBlank() &&
                produtoDTO.getDescricao() != null &&
                !produtoDTO.getDescricao().isEmpty() &&
                !produtoDTO.getDescricao().isBlank();
    }
}
