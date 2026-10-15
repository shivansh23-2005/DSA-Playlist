// LeetCode Problem: Reverse Only Letters
// Link: https://leetcode.com/problems/reverse-only-letters/
// Difficulty: Easy
// Language: c

char* reverseOnlyLetters(char* s) {
    int i,j;
	char temp;
    int size=strlen(s);
    i=0;
    j=size-1;
    while(i<j)
    {
		if(!isalpha(s[i]))
		{
			i++;
			continue;
		}
		else if(!isalpha(s[j]))
		{
			j--;
			continue;
		}
		else
		{
             temp=s[i];
    		s[i]=s[j];
    		s[j]=temp;
    		i++;
    		j--;
		}
	}
	return s;
}