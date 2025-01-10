public class stringClass_IMM {
    public static void main(String args[]){
        String str = "Ankush"; // Immutable(cannot change), but WHY
        /* 
         * Because String values are stored in special area called SCP(String constant pool) inside Heap which only two one value if both string reference varaible have same value.(WHY)
         * A String in Java that is specified as immutable, as the content shared storage in a single pool to minimize creating a copy of the same value. 
         * String class and all wrapper classes in Java that include Boolean, Character, Byte, Short, Integer, Long, Float, and Double are immutable.
        */
        String str2=str.concat("Kumar");
        System.out.println(str2);
        // Advantage of String beaing immutable:-
        // 1. If the string object "ANKUSH" is already available in memory then for another String of same object doesn't require new memory creation.
        // 2. Program execution becomes fast.
        // 3. To minimize creating a copy of the same value.
    }
}
