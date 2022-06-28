from collections import Counter


def minDeletions(s: str) -> int:
    frequencies = sorted(Counter(s).values(), reverse=True)

    print(frequencies)
    minDel = 0
    maxEntry = len(s)

    for freq in frequencies:
        maxEntry = min(maxEntry, freq)
        minDel += freq - maxEntry

        if maxEntry > 0:
            maxEntry -= 1

    return minDel


print(minDeletions("ceabaacb"))
