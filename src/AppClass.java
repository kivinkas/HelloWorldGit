public class AppClass {

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    public String getNameApp() {
        return nameApp;
    }

    String nameApp;

    AppClass(String s){
        nameApp = s;
    }

    public static void main(String[] args) {

        if (args.length>0) {
            AppClass ac = new AppClass(args[0]);
            System.out.println(ac.getNameApp());
        }
        else System.out.println("There is no parameter!");
    }
}
