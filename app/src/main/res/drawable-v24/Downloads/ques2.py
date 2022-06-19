file1 = open("ques2_1.txt", "r")
file2 = open("ques2_2.txt", "a")
for data in file1.read():
    if(data == "h" or data == "H"):
        file2.write("a")
    else:
        file2.write(data)
