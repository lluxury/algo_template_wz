package main

import (
	"fmt"
)


func bubbleSort(a []int)  {
	for i := 0; i < len(a); i++ {
		for j := i+1; j < len(a); j++ {
			if a[i] > a[j] {
				a[i],a[j]=a[j],a[i]
			}
		}
	}
}

func main() {
	date :=[]int{ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }
	bubbleSort(date)
	fmt.Println("date=",date)
}