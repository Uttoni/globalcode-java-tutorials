public class Loja {
    
    public Celular[] celulares = new Celular[40];

    public Loja(){
        cadastrarAparelhos();
    }

    private void cadastrarAparelhos(){
        celulares[0] = new Celular();
        celulares[0].nome = "iPhone 12 Pro / iPhone 12 Pro Max";
        celulares[0].marca = "Apple";
        celulares[0].ram = 6;
        celulares[0].armazenamentoInterno = "128,256,512";
        celulares[0].bateria = 3687;
        celulares[0].preco = 5000;

        celulares[1] = new Celular();
        celulares[1].nome = "iPhone 12 / iPhone 12 Mini";
        celulares[1].marca = "Apple";
        celulares[1].ram = 4;
        celulares[1].armazenamentoInterno = "64,128,256";
        celulares[1].bateria = 2227;
        celulares[1].preco = 4800;

        celulares[2] = new Celular();
        celulares[2].nome = "iPhone SE";
        celulares[2].marca = "Apple";
        celulares[2].ram = 3;
        celulares[2].armazenamentoInterno = "64,128,256";
        celulares[2].bateria = 1821;
        celulares[2].preco = 4600;

        celulares[3] = new Celular();
        celulares[3].nome = "iPhone 11 Pro / iPhone 11 Pro Max";
        celulares[3].marca = "Apple";
        celulares[3].ram = 6;
        celulares[3].armazenamentoInterno = "64,256,512";
        celulares[3].bateria = 3500;
        celulares[3].preco = 4400;

        celulares[4] = new Celular();
        celulares[4].nome = "iPhone 11";
        celulares[4].marca = "Apple";
        celulares[4].ram = 4;
        celulares[4].armazenamentoInterno = "64,256, 512";
        celulares[4].bateria = 3110;
        celulares[4].preco = 4200;

        celulares[5] = new Celular();
        celulares[5].nome = "iPhone XS / iPhone XS Max";
        celulares[5].marca = "Apple";
        celulares[5].ram = 4;
        celulares[5].armazenamentoInterno = "64,128,256";
        celulares[5].bateria = 2658;
        celulares[5].preco = 4000;

        celulares[6] = new Celular();
        celulares[6].nome = "iPhone XR";
        celulares[6].marca = "Apple";
        celulares[6].ram = 3;
        celulares[6].armazenamentoInterno = "64,128,256";
        celulares[6].bateria = 2942;
        celulares[6].preco = 3800;

        celulares[7] = new Celular();
        celulares[7].nome = "iPhone X";
        celulares[7].marca = "Apple";
        celulares[7].ram = 3;
        celulares[7].armazenamentoInterno = "256";
        celulares[7].bateria = 2716;
        celulares[7].preco = 3600;

        celulares[8] = new Celular();
        celulares[8].nome = "iPhone 8 / iPhone 8 Plus";
        celulares[8].marca = "Apple";
        celulares[8].ram = 2;
        celulares[8].armazenamentoInterno = "64,256";
        celulares[8].bateria = 1821;
        celulares[8].preco = 3400;

        celulares[9] = new Celular();
        celulares[9].nome = "iPhone 7 / iPhone 7 Plus";
        celulares[9].marca = "Apple";
        celulares[9].ram = 3;
        celulares[9].armazenamentoInterno = "256";
        celulares[9].bateria = 2675;
        celulares[9].preco = 3200;

        celulares[10] = new Celular();
        celulares[10].nome = "iPhone 6s / iPhone 6s Plus";
        celulares[10].marca = "Apple";
        celulares[10].ram = 2;
        celulares[10].armazenamentoInterno = "128";
        celulares[10].bateria = 2750;
        celulares[10].preco = 3000;
    }
}
