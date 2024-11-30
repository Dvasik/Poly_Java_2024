public class StringConversionExample {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer и StringBuilder
        String str = "Hello, World!";
        
        // Преобразование String в StringBuffer
        StringBuffer sb = new StringBuffer(str);
        
        // Преобразование String в StringBuilder
        StringBuilder sbld = new StringBuilder(str);
        
        // Преобразование StringBuffer в String и StringBuilder
        StringBuffer sbf = new StringBuffer("StringBuffer Example");
        
        // Преобразование StringBuffer в String
        String stringFromBuffer = sbf.toString();
        
        // Преобразование StringBuffer в StringBuilder
        StringBuilder sbldFromBuffer = new StringBuilder(sbf.toString());
        
        // Преобразование StringBuilder в String и StringBuffer
        StringBuilder sbd = new StringBuilder("StringBuilder Example");
        
        // Преобразование StringBuilder в String
        String stringFromBuilder = sbd.toString();
      
        // Преобразование StringBuilder в StringBuffer
        StringBuffer sbfFromBuilder = new StringBuffer(sbd.toString());
    }
}
