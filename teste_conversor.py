import unittest

from conversor_temperatura import fahrenheit_to_celsius, celsius_to_fahrenheit


class TestTemperatureConverter(unittest.TestCase):

    def test_fahrenheit_to_celsius(self):
        self.assertAlmostEqual(fahrenheit_to_celsius(32), 0, places=2)
        self.assertAlmostEqual(fahrenheit_to_celsius(212), 100, places=2)

    def test_celsius_to_fahrenheit(self):
        self.assertAlmostEqual(celsius_to_fahrenheit(0), 32, places=2)
        self.assertAlmostEqual(celsius_to_fahrenheit(100), 212, places=2)

if __name__ == '__main__':
    unittest.main()
