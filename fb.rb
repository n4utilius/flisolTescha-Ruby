class FizzBuzz
	def run(n)
		1.upto(n).each do |i|
	    	x = ''
	    	x += "Fizz"  if (i % 3 == 0 or i.to_s.include?("3")) 
	    	x += "Buzz" if (i % 5 == 0 or i.to_s.include?("5"))
	    	puts(x.empty? ? i : x)
	    end
	end
end

myfb = FizzBuzz.new()
myfb.run(100)