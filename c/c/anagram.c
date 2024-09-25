// 1.)	VALID ANAGRAM
// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are anagrams of each other.


int isAnagram(const char *s1, const char *s2)
{
    int len1 = strlen(s1);
    int len2 = strlen(s2);
    if (len1 != len2)
    {
        return 0;
    }
    int freq[26] = {0};
    for (int i = 0; i < len1; i++)
    {
        if (isalpha(s1[i]))
        {
            freq[tolower(s1[i]) - 'a']++;
        }
    }
    for (int i = 0; i < len2; i++)
    {
        if (isalpha(s2[i]))
        {
            freq[tolower(s2[i]) - 'a']--;
        }
    }
    for (int i = 0; i < 26; i++)
    {
        if (freq[i] != 0)
        {
            return 0;
        }
    }
    return 1;
}

int main()
{
    string s1 = "listen";
    string s2 = "silent";
    cout << boolalpha << isAnagram(s1, s2) << endl;

    s1 = "hello";
    s2 = "bello";
    cout << boolalpha << isAnagram(s1, s2) << endl;

    return 0;
}
