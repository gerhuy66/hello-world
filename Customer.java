public class Customer {
    private int taiKhoan = 10000;
         
    public Customer() {
        System.out.println("Balance = " + taiKhoan);
    }
         
    private synchronized void rutTien (int soTienRut) {
        System.out.println("WithDrawing" +
                " Amount = " + soTienRut + "...");
         
        if(taiKhoan > soTienRut) {
            System.out.println("Not enough Money to withdraw!");
            try {
                wait(); // phương thức wail sẽ đưa Thread rơi vào trạng thái sleeping
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
        taiKhoan-= soTienRut;
        System.out.println("Withdraw Success ! Balance:"+soTienRut);
    }
         
    private synchronized void nopTien(int soTienNop) {
        System.out.println("Depositing with" +
                " Amount = " + soTienNop + "...");
        taiKhoan += soTienNop;
        System.out.println("Success Deposit !. Balance = " + taiKhoan);
        notify();
    }
         
    public static void main(String[] args) {
         
        final Customer customer = new Customer();
         
        Thread t1 = new Thread(){
             
            public void run() {
                customer.rutTien(5000);
            }
             
        };
         
        t1.start();
             
        Thread t2 = new Thread(){
             
            public void run() {
                customer.nopTien(5000);
                customer.nopTien(5000);
            }
        };
         
        t2.start();
         
    }
     
}