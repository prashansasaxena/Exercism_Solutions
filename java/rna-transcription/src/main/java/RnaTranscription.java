import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        for(int i=0;i<dnaStrand.length();i++)
            {
                char nuc=dnaStrand.charAt(i);
                char rnaNucl;
        switch(nuc){
            case 'G':
                rnaNucl='C';
                break;
            case 'C':
                rnaNucl='G';
                break;
            case 'T':
                rnaNucl='A';
                break;
            default:
                rnaNucl='U';
                break;
        }
                rnaStrand+=rnaNucl;
                
                }
        return rnaStrand;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String rna=sc.next();
    System.out.println(new RnaTranscription().transcribe(rna));
}
}
