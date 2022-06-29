package numerotriangular;

public class Numero {
    
    private int n;
    private int i = 1;

    public Numero(int n) {
        this.n = n;
    }

    public int Escalar() {

        int r = 0;
        int q = 0;

        while (q != 1) {
            if (i * (i + 1) * (i + 2) == n) {
                r = i;
                q++;

            } else {
                i++;
            }
            if (i >= n) {
                r = 0;
                q++;
            }
        }
        return r;
    }

}
