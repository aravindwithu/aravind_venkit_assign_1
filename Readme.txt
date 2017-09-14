
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf aravind_venkit_assign_1.tar.gz aravind_venkit_assign_1

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.”

[Date: 09/13/2017]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

Used int array for myArrayList.
Used String array to store results which is of O(n).
Sorting is based on insert sort but inserts value in sort order.
i.e. If there is no value in index 0 the value is inserted in index 0 of myArrayList.
If the index is not 0 and the myArrayList value is -1, then the -1 is replaced with new value in myArrayList.
If there is any other value and if myArrayList value is greater than new value, then the myArrayList value is stored in temp variable and myArrayList value is replaced with new value.
The consecutive values are moved to respective next index.
Therefore time complexity is O(n) because the sorting done on insertion where the values are already maintained in sort order.

-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).

