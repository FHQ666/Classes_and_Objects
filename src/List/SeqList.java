package List;

public interface SeqList {
    // 向线性表中添加一个元素,默认在线性表尾部添加
    void add(int val);
    // 在索引为index的位置插入新元素
    void add(int index,int val);
    // 查询线性表中是否包含指定元素val
    boolean contains(int val);
    // 返回索引为index的元素值
    int get(int index);
    // 修改索引为index位置的元素为新值，返回修改前的元素值
    int set(int index,int newVal);
    // 删除线性表中索引为index的元素，返回删除前的元素值
    int removeByIndex(int index);
    // 删除第一个值为val的元素
    void removeByValueOnce(int val);
    // 在线性表中删除所有值为val的元素
    void removeAllValue(int val);
}
