package LeetCodePt2;

import java.util.Hashtable;

class AuthenticationManager {

    Hashtable<String, Integer> tokens;
    int lifetime;

    public AuthenticationManager(int timeToLive) {
        this.lifetime = timeToLive;

        tokens = new Hashtable<>();
    }

    public void generate(String tokenId, int currentTime) {

        if (!tokens.containsKey(tokenId)) {
            tokens.put(tokenId, currentTime + lifetime);
        }
    }

    public void renew(String tokenId, int currentTime) {
        if (tokens.containsKey(tokenId)) {
            if (currentTime > tokens.get(tokenId)) {
                tokens.remove(tokenId);
                return;
            }
            tokens.replace(tokenId, currentTime + lifetime);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (String str : tokens.keySet()) {
            if (tokens.get(str) > currentTime) {
                count ++;
            }
        }

        return count;
    }
}