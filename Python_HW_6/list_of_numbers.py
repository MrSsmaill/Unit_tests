class List_of_numbers:
    def __init__(self, value=None):
        if not isinstance(value, list):
            raise ValueError
        self.value = value

    def __str__(self) -> str:
        return super().__str__()
