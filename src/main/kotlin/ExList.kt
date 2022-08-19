fun main() {
    val produto = mutableListOf<String>()
    val quantidade = mutableListOf<Int>()
    while(true) {
        println("\n(1)Armazenar - (2)Remover - (3)Atualizar - (4)Apresentar")
        println()
        print("Opção: ")
        val num = readln().toInt()

        when (num) {
            1 -> {
                print("Digite um produto: ")
                produto.add(readln())
                print("Informe a quantidade: ")
                quantidade.add(readln().toInt())
                println("\nProduto adicionado com sucesso!\n")

            }
            2 -> {
                print("Digite o nome do produto que deseja remover: ")
                val nomeARemover = readln()
                if (produto.contains(nomeARemover)) {
                    val posic = produto.indexOf(nomeARemover)
                    produto.remove(nomeARemover)
                    quantidade.removeAt(posic)
                    print("produto $nomeARemover removido com sucesso!")
                } else {
                    print("Produto não encontrado")
                }
            }
            3 -> {print("Digite o produto que deseja modificar: ")
                  val nomeAModificar = readln()
                if(produto.contains(nomeAModificar)){
                    print("Atualize o nome $nomeAModificar: ")
                    val newName = readln()
                    val posic = produto.indexOf(nomeAModificar)
                    produto[posic] = newName
                    print("Nova quantidade?: ")
                    val newQuantidade = readln().toInt()
                    quantidade[posic] = newQuantidade
                    print("Estoque atualizado com sucesso!")
                }else{
                    print("Nome não encontrado")
                }
            }
            4 -> {print("Listando produtos: \n")
                for(indice in 0 until produto.size ){
                    println("Produto: ${produto[indice]} : ${quantidade[indice]}")
                }

            }
            0 -> {print("SAINDO")
                break
            }
            else -> { println("Opção não encontrada!")

            }



         }
        }

    }