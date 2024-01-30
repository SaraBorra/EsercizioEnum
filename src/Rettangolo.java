public class Rettangolo extends Forma{
    int base;
    int altezza;

    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    void calcolaArea(){
        int area = base * altezza;
        System.out.println("L'area del rettangolo è "+area);
    }
    @Override
    FormaTipo getTipo() {
        return FormaTipo.RETTANGOLO;
    }
}