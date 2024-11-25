fun main(args: Array<String>){
    val emp=employee(18018,"Sagnik")
    // default value for emp_name will be used there
    val emp2=employee(11011)
    // default values for both parameters
    // because no arguements passed
    val emp3=employee()
}
class employee(emp_id: Int=100,emp_name:String="abc"){
    val id: Int
    var name: String
    init{
        id=emp_id
        name=emp_name
        println("Employee Id is $id")
        println("Employee name: $name")
    }
}