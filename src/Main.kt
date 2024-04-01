//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){

    //Initialising an empty shopping list
    val shoppingList = mutableListOf<String>()

    while (true){
        println("যেকোন একটি অপশন নির্বাচন করুন:")
        println("1. লিস্টে একটি আইটেম যোগ করুন")
        println("2. লিস্ট থেকে একটি আইটেম বাদ দিন")
        println("3. শপিং লিস্ট দেখুন")
        println("4. বের হয়ে যান")

        // ইউজার ইনপুন নিন
        val choice = readlnOrNull()?.toIntOrNull()

        when (choice){
            1 -> {
                println("আইটেম যোগ করুন:")
                val item = readlnOrNull()
                if(!item.isNullOrEmpty()){
                    shoppingList.add(item)
                    println("$item লিস্টে যোগ করা হয়েছে")
                } else {
                    println("ইনপুট সঠিক নয়। অনুগ্রহপূর্বক আবার চেষ্টা")
                }
            }

            2 -> {
                if (shoppingList.isNotEmpty()){
                    println("রিমুভ করার জন্য আইটেমটির ইনডেক্স দিন:")
                    val index = readlnOrNull()?.toIntOrNull()
                    if (index != null && index in shoppingList.indices){
                        val removedItem = shoppingList.removeAt(index)
                        println("$removedItem লিস্ট থেকে বাদ দেয়া হয়েছে।")
                    } else {
                        println("ইনডেক্স নম্বরটি সঠিক নয়। আবার চেষ্টা করুন।")
                    }
                } else {
                    println("শপিং লিস্ট খালি আছে")
                }
            }

            3 -> {
                if (shoppingList.isNotEmpty()){
                    println("শপিং লিস্ট:")
                    for ((index, item) in shoppingList.withIndex()){
                        println("$index. $item")
                    }

                } else {
                    println("শপিং লিস্ট খালি আছে")
                }
            }

            4 -> {
                println("প্রোমাটি থেকে বের হচ্ছে")
                return
            }
            else -> {
                println("আপনার চয়েস সঠিক নয়। দয়া করে ১ - ৪ এর মধ্যে যেকোন একটি সংখ্যা দিন")
            }


        }
    }
}