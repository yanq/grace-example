import groovy.json.JsonBuilder
import groovy.json.StreamingJsonBuilder

StringWriter writer = new StringWriter()
def json = new StreamingJsonBuilder(writer)

json('aaddssrfffccfdxxddddddda')

println(writer.toString())