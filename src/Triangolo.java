public class Triangolo extends Forma{
    int base;
    int altezza;

    Triangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea(){
        int area = base * altezza / 2;
        System.out.println("L'area del triangolo è "+area);
    }

    @Override
    FormaTipo getTipo() {
        return FormaTipo.TRIANGOLO;
    }
}