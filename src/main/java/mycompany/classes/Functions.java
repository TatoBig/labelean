package mycompany.classes;

public class Functions {
    public String getProduct(String string){
        String product = "";
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='|'){
                for (int j = i+1; j < string.length(); j++) {
                    product = product + string.charAt(j);
                }
                break;
            }
        }
        return product;
    }
    public String getCategory(String string){
        String category = "";
        for (int i = 0; i < string.length(); i++) {            
            if(string.charAt(i)=='|'){
                break;
            }
            category = category + string.charAt(i);
        }
        return category;
    }
}
