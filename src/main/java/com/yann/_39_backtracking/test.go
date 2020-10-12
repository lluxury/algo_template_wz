package main

import (
	"fmt"
)

type Element interface {}

type Deque interface {
	AddFront(e ...Element)
	AddBack(e ...Element)
	RemoveFront() Element
	RemoveBack() Element
	PeekFront() Element
	PeekBack() Element
	Size() int
	Empty() bool
}

type ArrayDeque []Element

func (s *ArrayDeque) AddFront(e ...Element)  {
	ln := len(e)
	rev := make([]Element, ln)
	for i,v := range e {
		rev[ln -i -1] = v
	}
	*s = append(rev, *s...)
}

func (s *ArrayDeque) AddBack(e ...Element)  {
	*s = append(*s, e...)
}

func (s *ArrayDeque) RemoveFront() Element  {
	if s.Empty(){
		return nil
	}
	v :=(*s)[0]
	*s = (*s)[1:]
	return v
}

func (s *ArrayDeque) RemoveBack() Element  {
	if s.Empty() {
		return nil
	}
	ln := len(*s)
	v := (*s)[ln-1]
	*s = (*s)[:ln-1]
	return v
}

func (s *ArrayDeque) PeekFront() Element  {
	if s.Empty(){
		return nil
	}
	return (*s)[0]
}

func (s *ArrayDeque) PeekBack() Element  {
	if s.Empty(){
		return nil
	}
	return (*s)[len(*s)-1]
}

func (s *ArrayDeque) Size() int  {
	return len(*s)
}

func (s *ArrayDeque) Empty() bool  {
	return s.Size() == 0
}

func NewArrayDeque() Deque  {
	return &ArrayDeque{}
}

func main() {
	dq := NewArrayDeque()

	dq.AddFront(1,2,3,4,5,6,7,8,9)
	fmt.Println("AddFront:1,2,3,4,5,6,7,8,9")
	fmt.Println("RemoveFront:", dq.RemoveFront(),dq.RemoveFront())
	fmt.Println("RemoveBack:", dq.RemoveBack(),dq.RemoveBack())
}