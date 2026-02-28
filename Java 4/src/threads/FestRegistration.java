package threads;

public class FestRegistration {
    static class formfilling extends Thread{
        public void run(){
            System.out.println("form filling started!");
        }

    }
    static class DocumentUpload extends Thread{
        public void run(){
            System.out.println("document upload started!");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("comform email");
        }
    }

    public static void main(String[] args) {
        formfilling t1=new formfilling();
    DocumentUpload t2=new DocumentUpload();
    EmailNotification t3=new EmailNotification();
    t1.start();
    t2.start();
    t3.start();
    }
}
