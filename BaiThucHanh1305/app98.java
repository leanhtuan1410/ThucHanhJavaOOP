public public static void main(String [] args) {
    
    TreeMap<String, Double> treeMap1 = new TreeMap<>();

    Map<Float, Integer> map = new HashMap<>();
    TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
}