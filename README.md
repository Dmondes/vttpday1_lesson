## Compile instructions for Java

git init/n  
git add (file/folder)  
git commit -m "write changes made"  
git branch -M main  
git remote add origin <repo url>  
git push  

javac --source-path myapp -d bin myapp/*
<!--The command compiles all the .java source files in the myapp directory, using myapp as the source path. After compilation, it places the resulting .class files into the bin directory. The source code files are specified by myapp/* (i.e., all files in the myapp folder).-->
