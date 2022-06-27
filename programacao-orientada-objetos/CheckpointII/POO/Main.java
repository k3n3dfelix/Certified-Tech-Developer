package CheckpointII.POO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws PacientePublicoException, PacienteParticularException {

        PacientePublico paciente1 = new PacientePublico("joao", "bernardes", LocalDate.of(1985,10,25),"425");
        PacientePublico paciente2 = new PacientePublico("bianca", "rinaldi", LocalDate.of(1992,05,15),"528");
        PacientePublico paciente3 = new PacientePublico("jose", "marinho", LocalDate.of(1975,07,01),"250");

        PacienteParticular paciente4 = new PacienteParticular("maria", "silveira", LocalDate.of(1992,9,16),"864");
        PacienteParticular paciente5 = new PacienteParticular("pedro", "blanco", LocalDate.of(1963,04,20),"382");
        PacienteParticular paciente6 = new PacienteParticular("miriam", "laguerta", LocalDate.of(1998,02,11),"200");

        System.out.println("eh a promeira consulta de " + paciente1.getNome() + "?" + paciente1.isPrimeiraConsulta());
        ConsultaPublica consulta1p1 = new ConsultaPublica(1,LocalDate.of(2020,01,31), "CLinico Geral", LocalTime.of(10,30));
        System.out.println("paciente " + paciente1.getNome() + ": " + consulta1p1.efetuarAvaliacaoInicial(paciente1));
        System.out.println(paciente1.isPrimeiraConsulta());
        ConsultaPublica consulta2p1 = new ConsultaPublica(3,LocalDate.of(2020,05,15), "Otorrinolaringologia", LocalTime.of(11,30));
        System.out.println("paciente " + paciente1.getNome() + ": " + consulta2p1.efetuarAvaliacaoInicial(paciente1));
        ConsultaPublica consulta3p1 = new ConsultaPublica(5,LocalDate.of(2021,03,10), "Gastronterologia", LocalTime.of(9,0));
        System.out.println("paciente " + paciente1.getNome() + ": " + consulta3p1.efetuarAvaliacaoInicial(paciente1));

        System.out.println("eh a promeira consulta de " + paciente4.getNome() + "?" + paciente4.isPrimeiraConsulta());
        ConsultaParticular cconsulta1p4 = new ConsultaParticular(2,LocalDate.of(2020,02,01), "Pediatria", LocalTime.of(10,30));
        System.out.println("a paciente " + paciente4.getNome() + ": " + cconsulta1p4.efetuarAvaliacaoInicial(paciente4));
        System.out.println(paciente4.isPrimeiraConsulta());
        ConsultaParticular consulta2p4 = new ConsultaParticular(4,LocalDate.of(2020,05,20), "Cardiologia", LocalTime.of(11,30));
        System.out.println("a paciente " + paciente4.getNome() + ": " + consulta2p4.efetuarAvaliacaoInicial(paciente4));
        ConsultaParticular consulta3p4 = new ConsultaParticular(6,LocalDate.of(2021,03,15), "Ortopedia", LocalTime.of(9,0));
        System.out.println("a paciente " + paciente4.getNome() + ": " + consulta3p4.efetuarAvaliacaoInicial(paciente4));


        try {
            paciente1.addConsulta(consulta1p1);
            paciente1.addConsulta(consulta2p1);
            paciente1.addConsulta(consulta3p1);
            paciente4.addConsulta(cconsulta1p4);
            paciente4.addConsulta(consulta2p4);
            paciente4.addConsulta(consulta3p4);
            paciente4.addConsulta(consulta3p1);
        } catch (PacientePublicoException | PacienteParticularException e) {
            System.out.println(e.getMessage());
        }

        cconsulta1p4.setValorConsulta(500.00);
        System.out.println("o valor da consulta é: " + cconsulta1p4.informarValorConsulta());

        System.out.println(paciente1.mostrarConsultasOrdenadas());
    }

}
