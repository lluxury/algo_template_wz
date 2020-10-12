//type LFUCache struct {
//    m          map[int]*heap_useage
//        capacity    int
//}
//
//    type heap_useage struct {
//    Key    int
//    Value  int
//    Count  int
//    }
//
//    type heap_useages struct {
//    s []*heap_useage
//    }
//
//    func (r heap_useages) Len() int { return len(r.s) }
//
//    func (r heap_useages) Less(i, j int) bool { return r.s[i].Count < r.s[j].Count }
//
//    func (r heap_useages) Swap(i, j int) { r.s[i], r.s[j] = r.s[j], r.s[i] }
//
//    func getMinCount(m map[int]*heap_useage) int {
//    s := []*heap_useage{}
//    for _, v := range m {
//    s = append(s, v)
//    }
//    h := heap_useages{s}
//    sort.Sort(h)
//    return h.s[0].Key
//    }
//
//    func Constructor_460(capacity int) LFUCache {
//    return LFUCache{
//    m:        make(map[int]*heap_useage),
//    capacity: capacity,
//    }
//    }
//
//    func (this *LFUCache) Get(key int) int {
//    if v, ok := this.m[key]; ok {
//    v.Count++
//    return v.Value
//    }
//    return -1
//    }
//
//    func (this *LFUCache) Put(key int, value int) {
//    v, ok := this.m[key]
//    if ok {
//    v.Count++
//    v.Value = value
//    return
//    }
//
//    if len(this.m) >= this.capacity {
//    minKey := getMinCount(this.m)
//    delete(this.m, minKey)
//    }
//
//    this.m[key] = &heap_useage{
//    Key:   key,
//    Value: value,
//    Count: 1,
//    }
//    }