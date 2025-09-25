import org.w3c.dom.ls.LSInput;

void main() {
    System.out.println("Multiplication table of 2-9:");
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            String result=Integer.toString(i*j) ;
            if(result.length()==1 && j!=1) {
                System.out.print(" " + result + " ");
            }
            else{
                System.out.print(result + " ");
            }
        }
        System.out.println();
    }
}