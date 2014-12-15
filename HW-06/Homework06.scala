import scala.collection.mutable

case class User(name: String, email: String, grade: Int)

trait UserManagerTrait {
def add(name: String, email: String, grade: Int): Option[User]
def getUser(email: String): Option[User]
def getUserListForGrade(grade: Int): List[User]
def getCertainGrades(gradeSelector: (Int) => Boolean): List[String]
}
object UserManager extends UserManagerTrait {

val userList :mutable.HashMap[String,User]=new mutable.HashMap()

def add(name: String, email: String, grade: Int): Option[User] = {
if (!userList.contains(email)){
val user = new User(name, email, grade)
userList.put(email, user)
Some(user)
}
else
{
None
}

}
def getUser(email: String) : Option[User] = {
userList.get(email)
}
def getUserListForGrade(grade: Int) : List[User] = {
userList.values.toList.filter( us => us.grade == grade )
}
def getCertainGrades(gradeSelector: (Int) => Boolean): List[String] = {

userList.filter(us => gradeSelector(us._2.grade)).values.map((us:(User)) => us.name).toList;
}
}
