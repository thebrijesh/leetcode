import java.util.*;

class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;

        int[] freq = new int[1001];
        int SUM = 0;
        for (int s : skill) {
            SUM += s;
            freq[s]++; // frequency updated
        }

        int teams = n / 2;

        if (SUM % teams != 0) {
            return -1;
        }

        int target = SUM / teams;
        long chem = 0;

        for (int i = 0; i < n; i++) {
            int currSkill = skill[i];
            int remainSkill = target - currSkill;

            if (freq[remainSkill] <= 0) {
                return -1;
            }

            chem += (long) currSkill * (long) remainSkill;
            freq[remainSkill]--;
        }

        return chem / 2;
    }
}
