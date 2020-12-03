val str1:String="Hello"
val str2:String="World"

val str3:String="Hello"

println(str1.length) //Length
print(str1.concat(str2)) //Concatenation
print(str1.compareTo(str3)) //String compare
print(str1.compareTo(str2))
str1.compareTo(str1)

str1.charAt(1)  //Getting character at an index
str2.contains('d') //Returns boolean value if string contains a specific character
str3.contains('d')

str3.updated(0,'Y') //Updating a given string with a character at a specific index
str2.endsWith("d")  ////Returns boolean value if string ends with a specific character
str2.endsWith("l")

str1.hashCode

val str4:String="Github"

val str5:String=""
str5.isBlank  //Checking whether a given string is blank or not
str5.isEmpty
str4.view

val Git:List[Char]=str4.toList //Creating a list of characters from the string
println(Git)

str4.sizeIs //Size or Length of the string

str4.splitAt(3)  //Splitting the given string at the given index
str4.split("Gi")
