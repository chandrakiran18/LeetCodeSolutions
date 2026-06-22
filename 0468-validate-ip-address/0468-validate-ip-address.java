import java.util.StringTokenizer;

class Solution {

    public static boolean isValid(String s) {
        String[] parts = s.split(":", -1);
        if (parts.length != 8) return false;
        for (String part : parts) {
            if (part.isEmpty() || part.length() > 4) return false;
            for (char c : part.toCharArray()) {
                if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')))
                    return false;
            }
        }
        return true;
    }

    public String validIPAddress(String queryIP) {
        String ans = "Neither";

        if (queryIP.indexOf('.') != -1 && queryIP.indexOf(':') != -1)
            return ans;

        if (queryIP.indexOf('.') != -1) {
            if (queryIP.charAt(0) == '.' || queryIP.charAt(queryIP.length() - 1) == '.')
                return ans;

            if (queryIP.contains(".."))
                return ans;

            StringTokenizer st = new StringTokenizer(queryIP, ".");
            if (st.countTokens() != 4) return ans;

            while (st.hasMoreTokens()) {
                String temp1 = st.nextToken();

                if (temp1.length() == 0 || temp1.length() > 3) return ans;

                for (int i = 0; i < temp1.length(); i++) {
                    char c = temp1.charAt(i);
                    if (c < '0' || c > '9') return ans;
                }

                if (temp1.charAt(0) == '0' && temp1.length() > 1) return ans;

                int temp = Integer.parseInt(temp1);
                if (temp < 0 || temp > 255) return ans;
            }

            ans = "IPv4";
            return ans;
        } else if (queryIP.indexOf(':') != -1) {
            if (queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == ':')
                return ans;

            if (isValid(queryIP)) {
                ans = "IPv6";
                return ans;
            } else return ans;
        }

        return ans;
    }
}