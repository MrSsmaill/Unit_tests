def average_value(lst):
    if not isinstance(lst, list):
        raise ValueError
    return sum(lst) / len(lst)


def max_value(value_1, value_2):
    if not (isinstance(value_1, float) and isinstance(value_2, float)):
        raise ValueError
    elif value_1 > value_2:
        print('Первый список имеет большее среднее значение')
    elif value_2 > value_1:
        print('Второй список имеет большее среднее значение')
    else:
        print('Средние значения равны')
