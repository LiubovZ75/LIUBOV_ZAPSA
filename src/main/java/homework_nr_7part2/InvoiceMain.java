package homework_nr_7part2;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("Утюг","blue", 2, 405.00);
        Invoice inv2 = new Invoice("Миксер","white", 1, 130.00);
        Invoice inv3 = new Invoice("Фен","red", 3, 610.00);
        System.out.println("Сумма счета: " + inv1.getAmount());
        System.out.println("Сумма счета: " + inv3.getAmount());
    }
}
