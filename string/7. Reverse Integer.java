class Solution {
    public int reverse(int x) {
        try {
            //Req 1:
            //just reverse it ex: x=123, output = 321

            //Req 2:
            //x = -123 - in front needs to stay in front but othervice same

            //Req 3:
            //zeroes, if a zeros ends up in front it needs to be deleted

            boolean isNeg = false;

            String s = Integer.toString(x);
            StringBuilder sb = new StringBuilder(s);

            //if minus
            if (sb.charAt(0) == '-') {
                isNeg = true;
                sb.delete(0, 1); //removing it
            }

            sb.reverse();

            if (isNeg) {
                sb.insert(0, '-');
            }

            String revS = sb.toString();

            int ans = Integer.parseInt(revS);


            return ans;

        } catch (NumberFormatException e) {
            return 0;

        }


    }
}