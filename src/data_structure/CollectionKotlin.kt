package data_structure

interface CollectionKotlin<T> {

    fun add(t:T)
    fun get(index: Int)
    fun search(t:T)
    fun delete(t:T)
    fun size()

}