public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Larry Shumlich!");

        Hello h = new Hello();
        String s = h.sayHello();

        System.out.println("Returned from sayHello: " + s);
    }

    public String sayHello() {
        System.out.println("This is from sayHello");
        return "some value";
    }

}
