def uncommonSeq(str1, str2):
    if str1 == str2:
        return -1

    if len(str1) > len(str2):
        return len(str1)

    return len(str2)


if __name__ == '__main__':
    str1 = input()
    str2 = input()
    print(uncommonSeq(str1, str2))
