import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //escolher qual a categoria o veiculo se enquadra
        System.out.println("CATEGORIA DO VEICULO");
        System.out.println("1- Sedan");
        System.out.println("2- Hatch");
        System.out.println("3- Compacto");
        System.out.println("4- Suv");


        //solicitar o carro desejado
        System.out.println("Selecione o numero correspondente a Categoria:");
        int categoria = ler.nextInt();
        int modelo = 0;


        //seleção de categorias de acordo com o numero digitado

        //categoria #1
        if (categoria == 1){

        System.out.println("SEDAN");
        System.out.println("VEICULOS");
        System.out.println("1-Prisma");
        System.out.println("2-Cobalt");
        System.out.println("3-Jetta");
        System.out.println("Selecione o numero correspondente a Modelo:");
            modelo = ler.nextInt();

           if(modelo == 1){

               System.out.println("Modelo Selecionado: Prisma");


           } else if (modelo == 2) {

               System.out.println("Modelo Selecionado: Cobalt");

           } else if (modelo == 3) {

               System.out.println("Modelo Selecionado: Jetta");

           }
        //categoria #2
       } else if (categoria == 2) {
           System.out.println("HATCH");
           System.out.println("VEICULOS");
           System.out.println("1-Gol");
           System.out.println("2-Onix");
           System.out.println("3-Fox");
           System.out.println("Selecione o numero correspondente a Modelo:");
           modelo = ler.nextInt();

            if(modelo == 1){

                System.out.println("Modelo Selecionado: Gol");
            } else if (modelo == 2) {

                System.out.println("Modelo Selecionado: Onix");

            } else if (modelo == 3) {

                System.out.println("Modelo Selecionado: Fox");
            }
        //categoria #3
       } else if (categoria == 3) {
           System.out.println("COMPACTO");
           System.out.println("VEICULOS");
           System.out.println("1-Kwid");
           System.out.println("2-UP");
           System.out.println("3-Mobi");
           System.out.println("Selecione o numero correspondente a Modelo:");


            if(modelo == 1){

                System.out.println("Modelo Selecionado: Kwid");
            } else if (modelo == 2) {

                System.out.println("Modelo Selecionado: UP");

            } else if (modelo == 3) {

                System.out.println("Modelo Selecionado: Mobi");
            }

       } else if (categoria == 4) {

           System.out.println("COMPACTO");
           System.out.println("VEICULOS");
           System.out.println("1-T-Cross");
           System.out.println("2-Kicks");
           System.out.println("3-Creta");
           System.out.println("Selecione o numero correspondente a Modelo:");
           modelo = ler.nextInt();

            if(modelo == 1){

                System.out.println("Modelo Selecionado: T-Cross");
            } else if (modelo == 2) {

                System.out.println("Modelo Selecionado: Kicks");

            } else if (modelo == 3) {

                System.out.println("Modelo Selecionado: Creta");
            }

        }else  {
            System.out.println("Selecionar Categoria Correta");
            categoria = ler.nextInt();
            if (categoria == 1){

                System.out.println("SEDAN");
                System.out.println("VEICULOS");
                System.out.println("1-Prisma");
                System.out.println("2-Cobalt");
                System.out.println("3-Jetta");
                System.out.println("Selecione o numero correspondente a Modelo:");
                modelo = ler.nextInt();

                if(modelo == 1){

                    System.out.println("Modelo Selecionado: Prisma");


                } else if (modelo == 2) {

                    System.out.println("Modelo Selecionado: Cobalt");

                } else if (modelo == 3) {

                    System.out.println("Modelo Selecionado: Jetta");

                }
                //categoria #2
            } else if (categoria == 2) {
                System.out.println("HATCH");
                System.out.println("VEICULOS");
                System.out.println("1-Gol");
                System.out.println("2-Onix");
                System.out.println("3-Fox");
                System.out.println("Selecione o numero correspondente a Modelo:");
                modelo = ler.nextInt();

                if(modelo == 1){

                    System.out.println("Modelo Selecionado: Gol");
                } else if (modelo == 2) {

                    System.out.println("Modelo Selecionado: Onix");

                } else if (modelo == 3) {

                    System.out.println("Modelo Selecionado: Fox");
                }
                //categoria #3
            } else if (categoria == 3) {
                System.out.println("COMPACTO");
                System.out.println("VEICULOS");
                System.out.println("1-Kwid");
                System.out.println("2-UP");
                System.out.println("3-Mobi");
                System.out.println("Selecione o numero correspondente a Modelo:");


                if(modelo == 1){

                    System.out.println("Modelo Selecionado: Kwid");
                } else if (modelo == 2) {

                    System.out.println("Modelo Selecionado: UP");

                } else if (modelo == 3) {

                    System.out.println("Modelo Selecionado: Mobi");
                }

            } else if (categoria == 4) {

                System.out.println("COMPACTO");
                System.out.println("VEICULOS");
                System.out.println("1-T-Cross");
                System.out.println("2-Kicks");
                System.out.println("3-Creta");
                System.out.println("Selecione o numero correspondente a Modelo:");
                modelo = ler.nextInt();

                if(modelo == 1){

                    System.out.println("Modelo Selecionado: T-Cross");
                } else if (modelo == 2) {

                    System.out.println("Modelo Selecionado: Kicks");

                } else if (modelo == 3) {

                    System.out.println("Modelo Selecionado: Creta");
                }

            }
        }
        //o valor do km é de *0,20R$
        System.out.println("Digite o KM utilizado");
        double kmrodado = ler.nextDouble();

        //valor diaria R$200.00
        System.out.println("Digite a Quantidade de Dias");
        int diaria = ler.nextInt();

        //valor da diaria= R$200,00 * quantidade de dias= total // quantidade de km * o,20R$ = total
        //total

        double calc = (200.00*diaria)+(kmrodado*0.20);
        System.out.println();
        System.out.println("Valor Total da Locação R$"+calc);



    }
}
