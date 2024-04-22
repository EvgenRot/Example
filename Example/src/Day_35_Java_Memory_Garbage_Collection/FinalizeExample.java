package Day_35_Java_Memory_Garbage_Collection;

public class FinalizeExample {

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Объект будет удалён");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null;
        System.gc();
    }
}

