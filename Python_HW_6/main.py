import list_of_numbers
import calculation

list_1 = list_of_numbers.List_of_numbers([1, 2, 3, 4, 5])
list_2 = list_of_numbers.List_of_numbers([5, 4, 3, 2, 1])

average_1 = calculation.average_value(list_1.value)
average_2 = calculation.average_value(list_2.value)

calculation.max_value(average_1, average_2)
