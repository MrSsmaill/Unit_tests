import pytest as pytest

import list_of_numbers


@pytest.mark.parametrize("value", [
    10,
    (),
    'error',
])
def test_error_value(value):
    with pytest.raises(ValueError):
        list_of_numbers.List_of_numbers(value)
