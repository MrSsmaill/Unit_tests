import pytest

import calculation


@pytest.mark.parametrize("value", [
    10,
    (),
    'error',
])
def test_error_average_value(value):
    with pytest.raises(ValueError):
        calculation.average_value(value)


@pytest.mark.parametrize("value,average", [
    ([1, 3, 5], 3),
    ([1, 1, 1, 1], 1),
    ([1, 2, 3, 4, 5], 3),
])
def test_average_value(value, average):
    assert calculation.average_value(value) == average


@pytest.mark.parametrize("value_1,value_2", [
    (1, 1),
    (1.0, 1),
    (1, 1.0),
    ('error', 'error'),
])
def test_error_max_value(value_1,value_2):
    with pytest.raises(ValueError):
        calculation.max_value(value_1,value_2)


@pytest.mark.parametrize("value_1,value_2,result", [
    (2.0, 1.0, 'Первый список имеет большее среднее значение'),
    (1.0, 2.0, 'Второй список имеет большее среднее значение'),
    (3.0, 3.0, 'Средние значения равны'),
])
def test_max_value(value_1, value_2, result):
    with pytest.skip(result):
        calculation.max_value(value_1, value_2)
