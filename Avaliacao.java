
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main() {
    //ajuda para contar os dias;
    int i =1;
    int consumoTotal = 0;
    int diasValidos = 0;
     float mediaConsumo = 0;

   while (true) {
   
    int consumoLitros = Integer.parseInt(IO.readln("Digite o consumo:  "));
    
    if (consumoLitros <=0 && i == 1) {
        IO.println("Digite um numero maior que zero");
        break;
        
    }
   

     consumoTotal += consumoLitros;
   

    if(consumoLitros == 0 && i != 1){
       
    diasValidos++;    
        
    mediaConsumo = consumoTotal / diasValidos;

    break;
        
    }
        i++; 
   }

    if (mediaConsumo > 0 && mediaConsumo < 100) {
            System.out.println("Consumo Aceitavel");
         
        }
        
         if (mediaConsumo >= 100 && mediaConsumo <=175){
           IO.println("consumo Moderado");
         }

         if(mediaConsumo > 175)
            System.out.println("consumo Excessivo");
         
            
    

}
