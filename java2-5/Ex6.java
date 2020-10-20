class Ex6 {  
    public static void main(String[] args) {
        displayBox(5,3);
    }
    public static void displayBox(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
