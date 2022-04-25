function FizzBuzz(param1,param2){

    for(i=1;i<=100;i++){
        if(i%param1 === 0 && i%param2 === 0){
            console.log("FizzBuzz");
        }else if ( i%param1 === 0 ){
            console.log("Fizz");
        }else if (i%param2 === 0){
            console.log("Buzz");
        }else{
            console.log(i);
        }
    }
}

FizzBuzz(10,9);