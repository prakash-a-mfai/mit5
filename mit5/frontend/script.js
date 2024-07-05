
var expense=document.querySelector("text")
var amount=document.querySelector("am")

var items=[
    {
    id:1,name:"movie",}
    {id:2,name:"petrol"
    }
    
]
function display(){
    let obj=localStorage.setItem("obj",JSON.stringify(items))
    expense.innerHTML=items.push(obj);
    let element=
    `
    <tr>expense</tr>`
    `<tr>expense</tr>`
    `
    
    <button> delete</button>`
    ``
document.querySelector("dis").innerHTML=element
expense.innerHTML=items

}    
