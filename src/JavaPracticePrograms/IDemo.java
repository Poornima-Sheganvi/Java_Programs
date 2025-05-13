package JavaPracticePrograms;

public interface IDemo {
    interface A {
        default void show() {
            System.out.println("A's show");
        }
    }

    interface B {
        default void show() {
            System.out.println("B's show");
        }
    }

    class C implements A, B {
        @Override
        public void show() {
            A.super.show();
        }


    }
}
