class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String s : strs){
            encoded += s.length() + "#" + s ;
        }
        // System.out.println("decode target :" + encoded);
    return encoded;
    }

    public List<String> decode(String str) {
        // System.out.println("decode target :" + str);
        // List<String> test = new ArrayList<>();
        // test.add("hi");
        List<String> res = new ArrayList<>(); 
        int i=0;

        while (i<str.length())
        {
            int delimiter = str.indexOf('#',i);

            int length = Integer.parseInt(str.substring(i,delimiter));

            String word = str.substring(delimiter+1, delimiter+1+length);

            res.add(word);

            i = delimiter + 1 + length;
        }

        return res;
    }
}
