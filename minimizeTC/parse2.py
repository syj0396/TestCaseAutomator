import javalang

# Java 소스 코드
java_code = """
@Service
@RequiredArgsConstructor
@Slf4j
public class PlaceService {
    private static final String CATEGORY = "place";
    private final PlaceRepo placeRepo;
    private final ImageRepo imageRepo;
    private final S3Service s3Service;

    @Transactional
    public List<PlaceDto.Response> getAll() {
        return placeRepo.findAll()
                .stream()
                .map(place -> new PlaceDto.Response(
                        place,
                        imageRepo.findByPlace(place)))
                .collect(Collectors.toList());
    }
}
"""

# Java 코드 파싱
tree = javalang.parse.parse(java_code)

# 메소드 호출 추출
method_calls = []

for path, node in tree:
    if isinstance(node, javalang.tree.MethodInvocation):
        method_calls.append(node)

# Mockito 코드를 생성
mockito_code = []

for method_call in method_calls:
    # 메소드 호출 부분
    when_part = f"when({method_call.qualifier}.{method_call.member}()).thenReturn(mockedValue);"
    mockito_code.append(when_part)

# 생성된 Mockito 코드 출력
for code in mockito_code:
    print(code)
