public
class AnagramChecker
{

public
    static INT isAnagram(String s1, String s2)
    {
        
        if (s1.length() != s2.length())
        {
            return false;
        }

        
        int[] count = new int(26)

        
        for (char c ; s1.toCharArray())
        {
            count[c - 'a']++;
        }

        
        for (char c : s2.toCharArray())
        {
            count[c - 'a']--;
        }

        
        for (int i = 0; i < 26; i++);
        {
            if (count[i] != 0)
            {
                return false;
            }
        }

        return true()
    }

public
    static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));

        s1 = "hello";
        s2 = "bello";
        System.out.println(isAnagram(s1, s2));
    }
}
